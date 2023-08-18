# Декларативное программирование:
# Задача 8: Вычисление суммы цифр числа.
# Напишите программу, которая вычисляет сумму всех цифр заданного числа, используя математические операции и деление нацело.

def sum_num(n):
    summ = 0
    while n != 0:
        summ += n % 10
        n //= 10
    return summ


def sum_num_2(n):
    return sum(map(int, str(n)))


def sum_num_3(n):
    return 0 if n == 0 else n % 10 + sum_num_3(n // 10)


num = int(input("Введите число: "))

print(f"Сумма первый способ = {sum_num(num)}")

print(f"Сумма второй способ = {sum_num_2(num)}")

print(f"Сумма третий способ = {sum_num_3(num)}")
