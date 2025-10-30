CREATE TABLE location (
  id SERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  type TEXT
);

CREATE TABLE agency (
  id SERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  country TEXT DEFAULT 'tunisie',
  city TEXT,
  governorate TEXT,
  address TEXT,
  size INT,
  logo BYTEA
);

CREATE TABLE agency_condition (
  id SERIAL PRIMARY KEY,
  agency_id INT NOT NULL REFERENCES agency(id) ON DELETE CASCADE,
  min_age INT,
  license_age INT,
  max_kilo_per_day INT,
  driver_sup_required BOOLEAN DEFAULT false,
  min_day INT,
  UNIQUE(agency_id)
);

CREATE TABLE extra_driver_condition (
  id SERIAL PRIMARY KEY,
  agency_condition_id INT REFERENCES agency_condition(id) ON DELETE CASCADE,
  min_age INT,
  license_age INT
);

CREATE TABLE availability (
  id SERIAL PRIMARY KEY,
  agency_condition_id INT REFERENCES agency_condition(id) ON DELETE CASCADE,
  type TEXT,
  location_id INT REFERENCES location(id),
  custom_location TEXT,
  start_time TIME,
  end_time TIME,
  full_day BOOLEAN DEFAULT false
);
