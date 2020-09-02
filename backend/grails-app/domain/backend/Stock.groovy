package backend

class Stock {

    int price;

    Date priceDate;

    static belongsTo = [comp:Company]

    static constraints = {

        price nullable: false, blank: false

        priceDate nullable: false, blank: false

    }
}
