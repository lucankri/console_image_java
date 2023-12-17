# Удалить сборку в target:
rm -rf ./target/*

# Kомпилируем(собираем) нашу программу в каталог ./target:
javac -sourcepath src/java -d target src/java/edu/school21/printer/app/Program.java

# Копируем ресурсы:
cp -R src/resources ./target/.

# Создаем дистрибутивный пакет приложения - JAR-архив:
jar cfm target/images-to-chars-printer.jar src/manifest.txt -C target/ .

# Запускаем нашу программу, программа запускается с аргументами:
java -jar target/images-to-chars-printer.jar (символ - белый цвет) (символ - черный цвет) (путь до файла)
пример:
java -jar target/images-to-chars-printer.jar . O
