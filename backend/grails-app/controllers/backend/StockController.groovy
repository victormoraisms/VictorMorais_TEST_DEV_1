package backend

class StockController {

    def index() {

        stockService.getStocks("Nitryx", 30)

    }

    def list() {
        render stockService.getCompanies();
    }


    def stockService

    def getStocks(String empresa, int horas){

        try{

            stockService.getStocks(empresa, horas)

        }catch(e){

            flash.message = "Impossivel obter dados"

        }

    }




}
