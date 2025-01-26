class Human:
    # def __init__(self):
    #     self.num_eyes = 2
    #     self.num_nose = 1

    def eat(self):
        print('I eat food')

    def work(self):
        print('I can work')

class Male:
    # def __init__(self):
    #     super().__init__()
        # self.namaste = 5
        # self.slap = 7

    def flirt(self):
        print('I can flirt')

    def work(self):
        # super().work()
        print('I can code')

class Boy(Human,Male):
    pass
boy_1=Boy()
boy_1.eat()
boy_1.work() #this will give  the i can work but we want to access it form the male class
Male.work(boy_1) #sorted..
#same with attributes