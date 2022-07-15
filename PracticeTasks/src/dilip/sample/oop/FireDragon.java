package dilip.sample.oop;

import java.util.concurrent.Callable;

public class FireDragon implements Reptile {
	Callable<Reptile> fireDragon;
	
	public FireDragon() {
		fireDragon = new Callable<Reptile>() {			
			@Override
			public Reptile call() throws Exception {
				FireDragon fireDragonNew = new FireDragon();
				System.out.println("Calling New Fire Dragon");
				return fireDragonNew;
			}
		};
	}	
	
	@Override
	public ReptileEgg lay() {
		ReptileEgg fireDragonEgg = new ReptileEgg(fireDragon);
		System.out.println("Laying New Fire Dragon Egg");
		return fireDragonEgg;
	}
	
	public static void main(String[] args) throws Exception{
		FireDragon fireDragon = new FireDragon();
		System.out.println(fireDragon instanceof Reptile);
		fireDragon.lay();
	}
}



interface Reptile{
	ReptileEgg lay() throws Exception;
}

class ReptileEgg{
	Callable<Reptile> callableReptile;
	
	public ReptileEgg(Callable<Reptile> createReptile){
		this.callableReptile = createReptile;
		System.out.println("Calling New Reptile Egg");
	}
	
	public Reptile hatch() throws Exception {
		System.out.println("Hatching New Reptile Egg");
		
		Reptile newReptile = new Reptile() {
			@Override
			public ReptileEgg lay() throws Exception {
				System.out.println("Laying New Reptile Egg");
				ReptileEgg repEgg = new ReptileEgg(callableReptile);
				repEgg.callableReptile.call();
				return repEgg;
			}
		};
		
		return newReptile;	
	}
}
