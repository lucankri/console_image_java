# Удалить сборку в target:
rm -rf ./target/*

# Kомпилируем(собираем) нашу программу в каталог ./target:
javac -sourcepath src/java -d target src/java/edu/school21/printer/app/Program.java

# Запускаем нашу программу, программа запускается с аргументами:
java -classpath ./target edu.school21.printer.app.Program (символ - белый цвет) (символ - черный цвет) (путь до файла)
пример:
java -classpath ./target edu.school21.printer.app.Program . O ../../ex01/ImagesToChar/src/resources/it.bmp
