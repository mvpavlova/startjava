CREATE TABLE jaegers (
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark CHAR(6),
	height FLOAT(5),
	weight FLOAT(5),
	status TEXT,
	origin TEXT,
	launch INTEGER,
	kaijuKill INTEGER
);