from Publications.Book import Book

#Клас електронна книга, наслідує клас книга і має унікальне поле тип файлу
class ElectronicBook(Book):

    def __init__(self, authors, title, number_of_pages, file_type):
        super().__init__(authors, title, number_of_pages)
        self.file_type = file_type



    def __str__(self):
        return "Автори книги: " + self.authors + "; назва: " + \
               self.title + "; кількість сторінок: " + str(self.number_of_pages) + "; тип файлу: " + self.file_type





