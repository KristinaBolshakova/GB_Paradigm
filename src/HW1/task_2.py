# Императивное программирование:
# /Задача 2: Поиск наименьшего числа в списке.
# Напишите программу, которая находит наименьшее число в заданном списке с помощью цикла.

array = [2, 5, 9, 1, 6]

min_num = array[0]

for i in range(len(array)):
    if array[i] < min_num:
        min_num = array[i]

print(f"Наименьшее число в списке: {min_num}")
