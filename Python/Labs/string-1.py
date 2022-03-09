"""
 Girilen bir kelimenin tamamen küçük harflerden oluşup olmadığını yazan bir program yazın.

 ahmet, erzurum, ankara gibi girdiler için ekrana "girilen kelimeler küçük harflerden oluşur"
 Ahmet, erzURum, ANKARA gibi girdiler için ise ekrana "kelimede büyük harfler vardır"
"""

a = input()
t = True
for char in a:
    if(char.isupper()):
        print("kelimede büyük harfler vardır")
        t = False
if(t):
    print("girilen kelimeler küçük harflerden oluşur")
