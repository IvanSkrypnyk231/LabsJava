
from Publications.Book import Book

#Клас журнал, наслідує  клас книга і має унікальне поле номер видання
class Magazine(Book):

    def __init__(self, authors, title, number_of_pages, edition_number):
        super().__init__(authors, title, number_of_pages)
        self.edition_number = edition_number


    def __str__(self):
        return "Автори: " + self.authors + "; назва: " + self.title \
               + "; кількість сторінок: " + str(self.number_of_pages) + "; номер видання: " + str(self.edition_number)






