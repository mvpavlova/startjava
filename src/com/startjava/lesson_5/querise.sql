SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE status = 'Valid';
SELECT modelName,mark FROM jaegers WHERE mark ='Mark-1' OR mark ='Mark-6';
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);
SELECT modelName, kaijuKill FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);
SELECT modelName, kaijuKill FROM jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM jaegers);
SELECT AVG(weight) FROM jaegers;
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Valid';
DELETE FROM jaegers WHERE status = 'Valid';
