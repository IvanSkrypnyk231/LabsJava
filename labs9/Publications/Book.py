from Publications.Publication import Publication

#Клас книга, який наслідує публікацію і є батьком для класів журнал, монографія, електронна книга
class Book(Publication):

    def __init__(self, authors, title, number_of_pages):
        super().__init__(authors, title)
        self.number_of_pages = number_of_pages

    def __str__(self):
        return "Автори книги: " + self.authors + "; назва: " + \
               self.title + "; кількість сторінок: " + str(self.number_of_pages)






