#test plan
##basic
1.right now location

##takeorder
1. L
    1. class Location.show
    2. class Location.orientation
    3. class Location.locationX
    4. class Location.locationY
2. R
    1. init(1,1,E) R
3. M
    1. RM
4. LRLR
5. RMLRLM


##gotoborder
1.  left-given(11N) when(LM) return(11W)
2.  right-given(51E) when(M) return(51W)
3.  up-given(51N) when(M) return(51N)
4.  down-given(51S) when(M) return(51N)

##error input
1.  mapSize
    1.  given("")
    2.  given("1")
    3.  given("1 2 3")
    4.  given("a 1")
2.  locatioin
    1.  given("")
    2.  given("1 1")
    3.  given("1 1 N 1")
    4.  given("1 N N")
    5.  given("1 1 1")
3.  orders
    1.  given("")
    2.  given("WFM")


