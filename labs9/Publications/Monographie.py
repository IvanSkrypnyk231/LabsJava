from Publications.Book import Book

#Клас монографія, наслідує клас книга і має унікальне поле рецензія
class Monographie(Book):

    def __init__(self, authors, title, number_of_pages, review):
        super().__init__(authors, title, number_of_pages)
        self.review = review


    def __str__(self):
        return "Автори: " + self.authors + "; назва: " + \
               self.title + "; кількість сторінок: " + str(self.number_of_pages) + "; рецензія: " + self.review




