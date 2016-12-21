1. На вход программе задаются два IP адреса, программа перебирает все
допустимые адреса в введенном диапазоне и выдает их на экран.
Пример:
пользователь вводит с клавиатуры
192.168.0.1 и 192.168.0.5
Программа должна выдать
192.168.0.2
192.168.0.3
192.168.0.4

2. Есть программа, хранящая в памяти телефонную книгу (забита в коде программы).
Телефонная книга для каждого ФИО хранит список номеров.
Входные данные
Иванов И.И. +8 800 2000 500 +8 800 200 600
Петров П.П. +8 800 2000 700
Сидоров С.С. +8 800 2000 800 +8 800 2000 900 +8 800 2000 000

На вход программе подается ФИО, программа печатает телефоны, привязанные к этому ФИО.
Если телефона нет, программа должна выдать сообщение о том, что такого ФИО в БД нет.

Пример:
Пользователь вводит
Иванов И.И.
Программа выдает
1. +8 800 2000 500
2. +8 800 200 600

Обязательно. Использовать для реализации HashMap (для хранения сопоставления ФИО -> телефоны), ArrayList для хранения списка телефонов
