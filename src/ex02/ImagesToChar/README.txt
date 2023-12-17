# Удалить сборку в target:
rm -rf ./target/* ./lib/*

# Скачиваем библиотеки:
curl -s https://repo1.maven.org/maven2/com/beust/jcommander/1.72/jcommander-1.72.jar -o lib/jcommander-1.72.jar
curl -s https://repo1.maven.org/maven2/com/diogonunes/JCDP/4.0.0/JCDP-4.0.0.jar -o lib/JCDP-4.0.0.jar

# Извлкаем библиотеки:
cd target && jar xf ../lib/jcommander-1.72.jar && jar xf ../lib/JCDP-4.0.0.jar && cd ../

# Kомпилируем(собираем) нашу программу в каталог ./target:
javac -cp lib/JCDP-4.0.0.jar:lib/jcommander-1.72.jar: -sourcepath src/java -d target src/java/edu/school21/printer/app/Program.java

# Копируем ресурсы:
cp -R src/resources ./target/.

# Создаем дистрибутивный пакет приложения - JAR-архив:
jar cfm target/images-to-chars-printer.jar src/manifest.txt -C target/ .

# Запускаем нашу программу, программа запускается с аргументами:
java -jar target/images-to-chars-printer.jar --white=RED --black=GREEN
