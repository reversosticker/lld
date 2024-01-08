Airline System
---------------------------------------

Flight{
  flightNumber:String,
  duration:int,
  departure:Airport,
  arrival:Airport,
  seats:List<Seats> 

}

Seat{
    seatNumber:String,
    sclass:SeatClass
}

FlightSeat extends Seat{
   fare : double,
   bookingStatus: BookingStatus
}

Airport{
    name:String,
    address:Address,
    code:String,
    FlightList : List<Flight>

}

FlightSchedule{
    flight:Flight,
    departureDateTime : DateTime,
    gate:String,
    status:Flight,
    fseats : List<FlightSeat>
}

AirLine {
   name:String,
   code:String,
   flights : List<Flight>
}



enum FlightStatus{ ACTIVE,SCHEDULE,DELAYED,DEPARTED,CANCELLED}
enum BookingStatus{RESERVED,CANCELLED}


Customer{ 
    name:String,
    email:String,
    phoneNumber:String,
    address:Address
}


 /* when customer want to book a flight then he needs to pass details 
 when wants to book a flight
 how much seats and which flight he want to book
 so every seat user need to provide details */ 


FlightReservation{
    reservationNumber:String,
    flight:FlightSchedule,
    seatMap: Map<Customer,FlightSeat>
    creationDate:DateTime
    status:ReservationStatus
}


Notification System 
-------------------------------------------
Notification{
    id:int,
    createdOn:DateTime,
    content:String,
    send():boolean
}

EmailNotification extends Notification{
    email:String
    send():boolean
}

PhoneNotification extends Notification {
    phoneNumber:String,
    send():boolean
}


Payment System
-------------------------------------------
PaymentMethod{
    pay(double amount):boolean
}

Paypal implements PaymentMethod {
    name:String,
    cardNumber:String,
    expires:DateTime,
    pay(amount):boolean
}
s

MobileTransaction implements PaymentMethod {
    serviceProvider:String,
    mobileNumber:int,
    expires:Date,
    pay(double amount):boolean
}

#TODO add system of user authentication to add airport and flight details 