# Декларативное программирование:
# Задача 7: Поиск подстроки.
# Напишите программу, которая находит все вхождения заданной подстроки в строке с использованием встроенных функций.

text = 'Hello world from Java'
sub = 'a'

result = [text[i] for i in range(len(text)) if text.startswith(sub, i)]

print(result)
