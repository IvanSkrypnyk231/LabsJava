from Publications.Publication import Publication

#Клас аудіокнига, наслідує публікацію і має унікальне поле кількість секунд (тривалість аудіокниги)
class AudioBook(Publication):

    def __init__(self, authors, title, number_of_seconds):
        super().__init__(authors, title)
        self.number_of_seconds = number_of_seconds

    def __str__(self):
        return "Автори книги: " + self.authors + "; назва: " \
               + self.title + "; кількість секунд: " + str(self.number_of_seconds)


