Hotel System

For this exercise you will be given all objects as well as examples of their fields and their methods but the actual implementation of these items in code will be up to you to figure out. use this to practice your inheritance and composition as well as overloading and overriding.

x Room class
number ex: 102
type ex: ’single’
floor ex: 3
isOccupied: false
needsCleaning: false
occupant: a Client
averagePrice: 38000

x reserve = Should change room to isOccupied and assign the client to the occupant and update client bill to average price if isOccupied and needsCleaning are false otherwise print “unavailable” Should return true if successful or false if issue.

x checkout = remove the client from object and mark isOccupied as false, set needsCleaning to true, display o outstanding balance for the client.

x clean = set needsCleaning to false

x StandardRoom class: inherits from Room
…Room
type = single
rooms ex 1
beds ex 1

x override reserve = if party size > beds * 2 print unavailable otherwise run standard reserve 

SuiteRoom class:
…Room
type = suite
rooms ex 2
beds example 1
kitchenette ex: true
needsRestock: false

override reserve = include a check on needsRestock then run standard reserve.

override checkout = set needsRestock to true run standard checkout.

restock() = set needs restock to false

Client class
name ex: John Doe
partySize: 1
currentBill ex: 450
prepaid ex: 100
phoneNumber: 555-555-5555
roomNumber: 302
roomType: ‘double’

makePayment = increase prepaid 

chargeRoom = increase current bill

getOustanding = get outstanding balance.

Hotel class:
name ex: Hotel Java
rooms: 20
availableStandards: …StandardRooms
reservedStandards: …StandardRooms
availableSuites: …SuiteRooms
reservedSuites: …SuiteRooms
clients: …Clients

addRoom = add either a standard or suite to appropriate collection

reserveRoom = pull a room from the correct list. if empty print ‘unavailable’ otherwise, run the checkout for the room and move the room from available to reserved. Using the correct collection will make this easier. Add client to clients list

checkoutRoom = run the checkout process for a room and move the room from reserved to available.

getClientBalance = get the balance of a client by either their room number or name

additional challenge add a calculate price method. this method should increase the price by x% for each person above bed * 2 with a maximum capacity for the room at bed * 2 + room * 2. example a 1 bed 1 room can take 4 people max with 2 having a fee applied. a 2 bed 2 room has max occupancy of 8 with 4 being subject to fee. a 1 bed 3 room also has 8 occupancy but 6 fees can be applied. the standard room applies a 5% fee and suites apply an 8% fee. note this means the standard rooms will no longer deny at 2*bed but now deny at 2*bed + 2 * room. while the suite will not deny but if over capacity increase price by additional 50% per person after capacity.