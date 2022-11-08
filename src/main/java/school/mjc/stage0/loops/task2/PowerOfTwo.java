package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if(power<0){
            System.out.println("too much power");
        }


        int count=0,baseNum=2,total=1,count2=1;
        while(count<=power){

            while(count2<=count){
                total*=baseNum;
                count2++;
            }
            System.out.println(total);

        count++;
        }

    }
}
