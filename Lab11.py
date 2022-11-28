import re
from datetime import datetime

file = open('access.txt', 'r')


def check_if_line_apropriate(line):
    #отримаємо дату і наявність гет запиту  в рядку
    date, if_get_exists = extract_date(line)

    #виконаємо функцію check_date яка перевірить коректність дати і перевіримо чи існує запит гет
    if(check_date(date) and if_get_exists):

        return True

#функція виконання регулярних виразів і пошуку необхідних рядків
def extract_date(line):
    #регулярні вирази пошуку дати і style.css файлу
    getRegex = r"GET /style.css"
    dateRegex = r"(([2-9]{2}|30)/Mar{1}/[0-9]{4}:\d{1,2}:\d{1,2}:\d{1,2})"

    date = None
    get = None
    date_search = re.search(dateRegex, line)

    get_search = re.search(getRegex, line)

    #якщо знайшли результати, то отримуємо перший з них
    if (date_search != None):
        date = date_search[0]
    if (get_search != None):
        get = get_search[0]
    return date,get



#функція перевірки дати на входження в проміжок
def check_date(date):
    #коли дата не пуста
    if (date != None):
        #змінюємо слово Mar на число місяця - 03
        date = date.replace("Mar", "03")
        #перетворюємо об єкт у datetime завдяки паттерну
        string_datetime = datetime.strptime(date, "%d/%m/%Y:%H:%M:%S")
        #перевіряємо на входження в проміжок
        if datetime(2009,3,22,7,40,6) <= string_datetime <= datetime(2009,3,30,13,43,28):
            return True

    return False

get_style_css_amount = 0

while True:


    # Get next line from file
    line = file.readline()

    if (check_if_line_apropriate(line) == True):
        get_style_css_amount += 1
        print(line)

    # коли стрічка пуста, то виходимо з циклу, кінець файлу
    if not line:
        break
    #print("Line: {}".format(line.strip()))

print("Кількість успішних запитів GET з файлом style.css: " + str(get_style_css_amount))
file.close()