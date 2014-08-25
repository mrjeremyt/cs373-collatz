

def collatz_read (r) :
    """
    read two ints
    r is a reader
    return a list of the two ints, otherwise a list of zeros
    """
    s = r.readline()
    if s == "" :
        return []
    a = s.split()
    return [int(v) for v in a]

# ------------
# collatz_eval
# ------------

def collatz_eval (w, i, j) :
    """
    i is the beginning of the range, inclusive
    j is the end       of the range, inclusive
    return the max cycle length in the range [i, j]
    """
    M_C_L = 0
    m = j >> 1
    if(i < m):
        i = m
    # storage = [0] * 60
    cache = [0] * 1000000
    for n in range(min(i, j) , max(i, j) + 1):
        #length = collatz_compute(n)
        index = n
        assert n > 0
        length = 1
        while n > 1 :
            if(n < len(cache)):
                if(cache[n] != 0):
                    length = (length + int(cache[n])) - 1
                    break
            if (n % 2) == 0 :
                n = (n >> 1)
            else :
                n += (n >> 1) + 1
                length += 1
            length += 1
        assert length > 0
        if(length > M_C_L):
            M_C_L = length
        if(cache[index] == 0):
            cache[index] = length
        # storage[n] = length
    return M_C_L
    # for v in storage:
    #     w.write(str(v) + ",")



def mine(w, i, j):
    storage = [0] * 10001
    for n in range(min(i, j) , max(i, j) + 1):
        length = 1
        index = n
        while n > 1 :
            if (n % 2) == 0 :
                n = (n >> 1)
            else :
                n += (n >> 1) + 1
                length += 1
            length += 1
        assert length > 0
        storage[index] = length
    for v in range(1, len(storage)):
       w.write(str(storage[v]) + ",")


# -------------
# collatz_print
# -------------

def collatz_print (w, i, j, v) :
    """
    print three ints
    w is a writer
    i is the beginning of the range, inclusive
    j is the end       of the range, inclusive
    v is the max cycle length
    """
    w.write(str(i) + " " + str(j) + " " + str(v) + "\n")

# -------------
# collatz_solve
# -------------

def collatz_solve (r, w) :
    """
    read, eval, print loop
    r is a reader
    w is a writer
    """
    while True :
        a = collatz_read(r)
        if not a :
            return
        i, j = a
        # v = collatz_eval(w, i, j)
        # collatz_print(w, i, j, v)
        v = mine(w, i, j)


# ----
# main
# ----
import sys
collatz_solve(sys.stdin, sys.stdout)
