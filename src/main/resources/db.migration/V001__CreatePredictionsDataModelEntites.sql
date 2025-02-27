# USE predictions_db;
#
# CREATE TABLE IF NOT EXISTS predictions_db.greetings (
#     id SERIAL PRIMARY KEY,
#     greetings_title VARCHAR(255) NOT NULL
#     );
#
# INSERT INTO predictions_db.greetings (greetings_title) VALUES
#     ('Добро пожаловать'),
#     ('Привет'),
#     ('Отличного тебе дня'),
#     ('Рады видеть тебя'),
#     ('Хорошего настроения');
#
# CREATE TABLE IF NOT EXISTS predictions_db.cards_images (
#     id SERIAL PRIMARY KEY,
#     image_data BLOB NOT NULL,  -- Поле для хранения бинарных данных картинки
#     upload_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
#     image_name VARCHAR(255) NOT NULL
#     );
#
# SET @image_path = 'static/images/taro_cards/';
#
# INSERT INTO predictions_db.cards_images (image_data, image_name) VALUES
#       (LOAD_FILE(CONCAT(@image_path, 'image0.jpg')), 'Шут'),
#       (LOAD_FILE(CONCAT(@image_path, 'image1.jpg')), 'Маг'),
#       (LOAD_FILE(CONCAT(@image_path, 'image2.jpg')), 'Верховная Жрица'),
#       (LOAD_FILE(CONCAT(@image_path, 'image3.jpg')), 'Императрица'),
#       (LOAD_FILE(CONCAT(@image_path, 'image4.jpg')), 'Император'),
#       (LOAD_FILE(CONCAT(@image_path, 'image5.jpg')), 'Иерофант'),
#       (LOAD_FILE(CONCAT(@image_path, 'image6.jpg')), 'Влюбленные'),
#       (LOAD_FILE(CONCAT(@image_path, 'image7.jpg')), 'Колесница'),
#       (LOAD_FILE(CONCAT(@image_path, 'image8.jpg')), 'Сила'),
#       (LOAD_FILE(CONCAT(@image_path, 'image9.jpg')), 'Отшельник'),
#       (LOAD_FILE(CONCAT(@image_path, 'image10.jpg')), 'Колесо Фортуны'),
#       (LOAD_FILE(CONCAT(@image_path, 'image11.jpg')), 'Справедливость'),
#       (LOAD_FILE(CONCAT(@image_path, 'image12.jpg')), 'Повешенный'),
#       (LOAD_FILE(CONCAT(@image_path, 'image13.jpg')), 'Смерть'),
#       (LOAD_FILE(CONCAT(@image_path, 'image14.jpg')), 'Умеренность'),
#       (LOAD_FILE(CONCAT(@image_path, 'image15.jpg')), 'Дьявол'),
#       (LOAD_FILE(CONCAT(@image_path, 'image16.jpg')), 'Башня'),
#       (LOAD_FILE(CONCAT(@image_path, 'image17.jpg')), 'Звезда'),
#       (LOAD_FILE(CONCAT(@image_path, 'image18.jpg')), 'Луна'),
#       (LOAD_FILE(CONCAT(@image_path, 'image19.jpg')), 'Солнце'),
#       (LOAD_FILE(CONCAT(@image_path, 'image20.jpg')), 'Суд'),
#       (LOAD_FILE(CONCAT(@image_path, 'image21.jpg')), 'Мир'),
#       (LOAD_FILE(CONCAT(@image_path, 'image22.jpg')), 'Туз Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image23.jpg')), 'Двойка Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image24.jpg')), 'Тройка Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image25.jpg')), 'Четверка Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image26.jpg')), 'Пятерка Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image27.jpg')), 'Шестерка Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image28.jpg')), 'Семерка Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image29.jpg')), 'Восьмерка Жезлов'),
#       (GhLOAD_FILE(CONCAT(@image_path, 'image30.jpg')), 'Девятка Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image31.jpg')), 'Десятка Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image32.jpg')), 'Паж Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image33.jpg')), 'Рыцарь Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image34.jpg')), 'Королева Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image35.jpg')), 'Король Жезлов'),
#       (LOAD_FILE(CONCAT(@image_path, 'image36.jpg')), 'Туз Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image37.jpg')), 'Двойка Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image38.jpg')), 'Тройка Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image39.jpg')), 'Четверка Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image40.jpg')), 'Пятерка Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image41.jpg')), 'Шестерка Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image42.jpg')), 'Семерка Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image43.jpg')), 'Восьмерка Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image44.jpg')), 'Девятка Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image45.jpg')), 'Десятка Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image46.jpg')), 'Паж Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image47.jpg')), 'Рыцарь Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image48.jpg')), 'Королева Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image49.jpg')), 'Король Кубков'),
#       (LOAD_FILE(CONCAT(@image_path, 'image50.jpg')), 'Туз Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image51.jpg')), 'Двойка Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image52.jpg')), 'Тройка Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image53.jpg')), 'Четверка Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image54.jpg')), 'Пятерка Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image55.jpg')), 'Шестерка Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image56.jpg')), 'Семерка Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image57.jpg')), 'Восьмерка Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image58.jpg')), 'Девятка Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image59.jpg')), 'Десятка Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image60.jpg')), 'Паж Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image61.jpg')), 'Рыцарь Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image62.jpg')), 'Королева Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image63.jpg')), 'Король Мечей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image64.jpg')), 'Туз Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image65.jpg')), 'Двойка Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image66.jpg')), 'Тройка Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image67.jpg')), 'Четверка Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image68.jpg')), 'Пятерка Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image69.jpg')), 'Шестерка Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image70.jpg')), 'Семерка Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image71.jpg')), 'Восьмерка Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image72.jpg')), 'Девятка Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image73.jpg')), 'Десятка Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image74.jpg')), 'Паж Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image75.jpg')), 'Рыцарь Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image76.jpg')), 'Королева Пентаклей'),
#       (LOAD_FILE(CONCAT(@image_path, 'image77.jpg')), 'Король Пентаклей');
