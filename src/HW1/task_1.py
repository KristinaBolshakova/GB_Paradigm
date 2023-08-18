# Императивное программирование:
# Задача 1: Подсчет суммы четных чисел от 1 до N.
# Напишите программу, используя цикл, которая находит сумму всех четных чисел в диапазоне от 1 до заданного числа N.

num = int(input("Введите N: "))
summ = 0

for i in range(num + 1):
    if i % 2 == 0:
        summ += i

print(f"Сумма четных чисел: {summ}")