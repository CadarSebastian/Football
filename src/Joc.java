
public class Joc {
	 
	public void simuleaza() {
		Minge m1 = new Minge(50, 25);
		Echipa e1 = new Echipa("Banane");
		Echipa e2 = new Echipa("Mere");

		for (int i = 0; i <= 1000; i++) {

			try {
				m1.suteaza();
				if(m1.getX() == 0 && m1.getY() >= 20 && m1.getY() <= 30 || m1.getX() == 100 && m1.getY() >= 20 && m1.getY() <= 30)
				throw new Gol("gol");
				else if(m1.getY() == 0 || m1.getY() == 50)
					throw new Out("out");
				else if(m1.getY() <= 20 && m1.getX() == 0 || m1.getY() <= 20 && m1.getX() == 100 || m1.getY() >= 30 && m1.getX() == 0 ||m1.getY() >= 30 && m1.getX() == 100)
					throw new Corner("Corner");
					else m1.suteaza();
					
				
					
			} catch (Gol g) {
				if (m1.getX() == 0 && m1.getY() >= 20 && m1.getY() <= 30) {
					e1.setGol(e1.getGol() + 1);
					System.out.println(e1.getGol());
				} else if (m1.getX() == 100 && m1.getY() >= 20 && m1.getY() <= 30) {
					e2.setGol(e2.getGol() + 1);
					System.out.println(e2.getGol());
				}
				m1.setX(50);
				m1.setY(25);
				
				

			} catch (Out o) {System.out.println(o.getMessage()+""+m1);
			
				if (m1.getY() == 0 || m1.getY() == 50) {
					m1.setX(m1.getX());
					m1.setY(m1.getY());
				}

			} catch (Corner c) {System.out.println(c.getMessage()+""+m1);
			 
             if ( m1.getY() <= 20 && m1.getX() == 0) {
                 m1.setX(0);
                 m1.setY(0);
             }
             if ( m1.getY() <= 20 && m1.getX() == 100) {
                 m1.setX(100);
                 m1.setY(0);
             }
             if ( m1.getY() >= 30 && m1.getX() == 0) {
                 m1.setX(0);
                 m1.setY(50);
             }
             if ( m1.getY() >= 30 && m1.getX() == 100) {
                 m1.setX(100);
                 m1.setY(50);
             }

			}

		}

	

	}
}
