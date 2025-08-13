package BancoXPTOClass;

    public abstract class Operacao{
        protected double atDouble;

        public Operacao(){}
        public Operacao(double atDouble){
            this.atDouble = atDouble;
        }
        public abstract double operar();
    }


