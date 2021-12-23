package oodesafio;

public class Ferrari extends Carro implements Esportivo,Luxo{
	private boolean ligarTurbo;
	private boolean ligarAr;
//	@Override
//	protected void acelerar() {
//		super.acelerar();
//		super.acelerar();
//		super.acelerar();
//	}
//	
//	@Override
//	protected void frear() {
//		super.frear();
//		super.frear();
//		super.frear();
//	}
	Ferrari(){
		this(300);
	}
	Ferrari(int velocidadeMax){
		super(velocidadeMax);
		this.setDelta(15);
	}
	@Override
		public void ligarAr() {
		ligarAr = true;
			
		}
	@Override
		public void desligarAr() {
		ligarAr = false;
			
		}
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;		
	}
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;	
	}
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr)
			return 20;
		else {
			return 15;			
		}
	}
	
	
//	@Override
//		protected void acelerar() {
//			
//			this.velocidadeAtual += 15;
//		}
//	
//@Override
//	protected void acelerar() {
//		// TODO Auto-generated method stub
//		super.acelerar();
//	}
}
