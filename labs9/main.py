

from Publications.Book import Book
from Publications.AudioBook import AudioBook
from Publications.ElectronicBook import ElectronicBook
from Publications.Magazine import Magazine
from Publications.Monographie import Monographie

if __name__ == '__main__':
    #Створимо один екземпляр з кожного класу, заповнимо дані
    book = Book("Джек Лондон", "Морський Вовк", 300)
    audio_book = AudioBook("Джек Лондон", "Морський Вовк", 14432)
    electronic_book = ElectronicBook('Рей Бредберрі',"Кульбабове вино",341,'pdf')
    magazine = Magazine("Джеффрі Клугер", "Times", 45, 37)
    monographie = Monographie("Нікітишин.А.О", "Податкова політика в умовах економічних перетворень", 120, "Монографія описує податкову політику в умовах економічних перетворень, кількість сторінок: 120.")

    #Виведемо дані через метод str
    print("Друкована книга - " + str(book))
    print("Аудіо книга - " + str(audio_book))
    print("Електронна книга - " + str(electronic_book))
    print("Журнал - " + str(magazine))
    print("Монографія - " + str(monographie))
