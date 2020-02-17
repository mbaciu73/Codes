#Program which will add,subtract,multiplay and display the magnitude of of a vector
#Author:Markus Baciu
#Date:12.12.2019
class Vector(object):
    #initialising instances and making them floats
    def __init__(self,x:float,y:float,z:float,):
        self.x = x
        self.y = y
        self.z = z

    def __str__(self):
        #reprsenting the data in the format(x,y,z)
        return "({:f},{:f},{:f})".format(self.x,self.y,self.z)

    def __add__(self, other)->float:
        #adding vectors together
        #calls the other vector from other
        first = self.x + other.x
        second = self.y+other.y
        third = self.z+other.z

        return first,second,third

    def __sub__(self, other)->float:
        #subtracting vectors from each other
        first = self.x - other.x
        second = self.y - other.y
        third = self.z - other.z

        return first,second,third

    def __mul__(self, other)->float:
        #if other is a number and not a vector do the following
        #it returns the product together
        if type(other) is int:
            first = self.x*other
            second = self.y*other
            third = self.z*other
            return first*second*third
        #if other is a vector do the following
        #it returns the values seperately
        else:
            first = self.x*other.x
            second = self.y*other.y
            third = self.z*other.z
            return first,second,third
    #in case a user has entered it with the class at the end for the following 3
    def __radd__(self,other):
         return self.__add__(other)

    def __rsub__(self, other):
        return other - self.__sub__(other)
    def __rmul__(self, other):
            return self.__mul__(other)
    #displays the magnitude, multiplying together and adding the values, then sqaure rooting the value
    def magnitude(self):
        first = self.x * self.x
        second = self.y * self.y
        third = self.z * self.z

        total = first+second+third

        square = total**0.5

        return square




v1 = Vector(2,4,5)
print("V1 contains",v1)
v2 = Vector(5,6,7)
print("V2 contains",v2)
v3 = v1 + v2
print("The sum of V1 and V2 is",v3)
v4 = v1 - v2
print("The difference of V1 and V2 is",v4)
v5 = v1 * v2
print("The multiplication of V1 and V2 is",v5)
v6 = v1 * 5
print("The multiplication of V1 by 5 is",v6)
v7 = v1.magnitude()
print("Magnitude of V1 is ",v7)



