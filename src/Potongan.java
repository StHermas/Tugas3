public class Potongan {
    public int Potongan(int gajiall){
        if(gajiall>=3000000){
            int potongan=gajiall*10/100;
            int gajipot=gajiall-potongan;
            return gajiall;
        }
        else{
            return gajiall;
        }

    }

}
