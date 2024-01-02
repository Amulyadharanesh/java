public class PhoneRunner{

public static void main(String[]args)
{
Phone.call();//static method

Phone.msg();

Phone.sim();

Phone.network();

Phone.charging();

Phone obj = new Phone();//non static method
obj.recharge();

Phone obj=new Phone();
obj.pick();

Phone obj=new Phone();
obj.cut();

Phone obj=new Phone();
obj.callFowarding();

Phone obj=new Phone();
obj.mute();
}
}





