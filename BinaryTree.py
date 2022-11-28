#Створимо клас, який описує елемент бінарного дерева
class Node:

    def __init__(self, rating, name, surname, group_id, birth_date):
        self.left = None
        self.right = None
        self.rating = rating
        self.name = name
        self.surname = surname
        self.group_id = group_id
        self.birth_date = birth_date

    #Визначимо функцію str для виводу елементу бінарного дерева
    def __str__(self):
        return self.name +  " " + self.surname + ", група: " + self.group_id \
               + "; рейтинг: " + str(self.rating) + "; рік народження: " + self.birth_date


def insert(root, rating, name, surname, group_id, birth_date):

    #Якщо немає вершини, то створимо нову
    if root is None:
        return Node(rating, name, surname, group_id, birth_date)
    else:
        #Шукаємо місце для додавання нової вершини, якщо рейтинг менше, то додаємо в ліву гілку
        #Якщо рейтинг вище - додаємо в праву гілку
        if root.rating == rating:
            return root
        elif root.rating < rating:
            root.right = insert(root.right, rating, name, surname, group_id, birth_date)
        else:
            root.left = insert(root.left, rating, name, surname, group_id, birth_date)
    return root



def inorder(root):
    #Функція послідовного обходу дерева
    if root:
        #Виконаємо рекурсію і виведемо усі гілки елемента
        inorder(root.left)
        print(root)
        inorder(root.right)


def search(root, key):
    #Функція пошуку вершини, якщо рейтинг менше за заданий, то шукаємо в правій гілці, якщо вище - в лівій
    if root is None or root.rating == key:
        return root



    if root.rating < key:
        return search(root.right, key)

    return search(root.left, key)

def find_all_rating_higher_than(root,rating, rankings_array):
    #Перебираємо усі вершини і вибираємо ті, які вище за заданий рейтинг
    if root:
        find_all_rating_higher_than(root.left, rating, rankings_array)
        if (root.rating > rating):
            rankings_array.append(root)
        find_all_rating_higher_than(root.right, rating, rankings_array)

def find_all_groups_by_id(root,group_id, groups_array):
    # Перебираємо усі вершини і вибираємо ті, де є вказаний номер групи
    if root:
        find_all_groups_by_id(root.left, group_id, groups_array)
        if (root.group_id ==  group_id):
            groups_array.append(root)

        find_all_groups_by_id(root.right, group_id, groups_array)



def minValueNode(node):
    #Шукаємо мінімальне значення в дереві, для цього йдем по лівій гілці
    current = node

    while (current.left is not None):
        current = current.left

    return current



def deleteNode(root, key):
    #Функція видалення вершини

    if root is None:
        return root

    #Шукаємо значення key в дереві, якщо значення менше, то шукаємо в лівій частині, якщо більше, то в правій
    if key < root.rating:
        root.left = deleteNode(root.left, key)

    elif (key > root.rating):
        root.right = deleteNode(root.right, key)

    else:

    #Величина знайдена, тепер розглядаємо різні випадки наявності гілок в вершини
    #Якщо немає лівої гілки, то замінюємо її на праву
        if root.left is None:
            temp = root.right
            root = None
            return temp
    # Якщо немає правої гілки, то замінюємо її на ліву
        elif root.right is None:
            temp = root.left
            root = None
            return temp

        #Шукаємо мінімальне значення
        temp = minValueNode(root.right)


        #Копіюємо дані
        root.rating = temp.rating
        root.name = temp.name
        root.surname = temp.surname
        root.group_id = temp.group_id
        root.birth_date = temp.birth_date
        #Видаляємо мінімальне значення
        root.right = deleteNode(root.right, temp.rating)

    return root

#Створимо декілька студентів
r = Node(1, "Максим", "Отченко", "55", "2000")
r = insert(r,2, "Валентина", "Скрибайло", "55", "2001")
r = insert(r,3, "Юрій", "Пукач", "55", "2002")



for i in range(5,8):
    r = insert(r,i,"Test" + str(i), "TestSurname" + str(i), "55", "2000")

for i in range(3,5):
    r = insert(r,i,"Test" + str(i), "TestSurname" + str(i), "55", "2003")


for i in range(80,83):
    r = insert(r,i,"Test" + str(i), "TestSurname" + str(i), "15", "2000")

for i in range(63,65):
    r = insert(r,i,"Test" + str(i), "TestSurname" + str(i), "55", "2000")

print("Студент з рейтингом 3: " + str(search(r,3)))

print("Студент з рейтингом 7: " + str(search(r,7)))

rankings_array = []
groups_id = []
find_all_rating_higher_than(r,60,rankings_array)
print("Усі студенти з рейтингом вище 60: ")
for node in rankings_array:
    print(node)

find_all_groups_by_id(r,"15", groups_id)
print("Усі студенти групи номер 15: ")
for node in groups_id:
    print(node)

print("\nУсі студенти, після видалення студентів групи 15: ")

for node in groups_id:
    deleteNode(r,node.rating)

#Зробимо послідовний обхід дерева
inorder(r)