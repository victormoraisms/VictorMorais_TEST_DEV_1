package backend


class Company {

    String nome;
    String segmento;

    static hasMany=[stock:Stock]

    static constraints = {
        nome maxSize: 255, nullable: false, blank: false, unique: true

        segmento maxSize: 255, nullable: false, blank: false

    }

    static mapping = {
        autowire: true
    }
}
