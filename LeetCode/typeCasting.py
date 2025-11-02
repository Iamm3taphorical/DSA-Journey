var = int(input("Please enter a number:"))
var2 = str(input("please enter a string: "))

n_var = float(var)
print(n_var)
print(type(n_var))

def find_pairs(arr):
    pair = []
    for i in arr:
        for j in arr:
            pairs.append((i,j))
            return pairs
def print_pairs(pairs):
    for p in pairs:
        print(f"Pair: {p}, Types: ({type(p[0])}, {type(p[1])})")