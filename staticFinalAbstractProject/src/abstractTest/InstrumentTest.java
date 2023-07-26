package abstractTest;

public class InstrumentTest {

}

interface Instrument
{
	void use(); 
}
abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Guitar...");
	}
	void play() {
		System.out.println("Playing Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");

	}
}

class ElectronicGuitar extends Guitar {
	
	public void use() {
		System.out.println("Using Electronic Guitar...");
	}
	void play() {
		System.out.println("Playing Electronic Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Electronic Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Electronic Guitar...");

	}
	void preset() {
		System.out.println("Using preset to create music...");
	}
	
}

class Violin extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Violin...");
	}
	void play() {
		System.out.println("Playing Violin...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");

	}
	void bow() {
		System.out.println("Bowing Strings of Violin...");

	}
	
}

class Cello extends Violin{
	public void use() {
		System.out.println("Using Cello...");
	}
	void play() {
		System.out.println("Playing Cello...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Cello...");

	}
	void bow() {
		System.out.println("Bowing Strings of Cello...");

	}
	void longBow() {
		System.out.println("long Bowing the Cello ");
	}
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void blowAir();
}
class Flute extends AirBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Flute...");
	}
	void play() {
		System.out.println("Playing Flute...");

	}
	void blowAir() {
		System.out.println("Blowing air to Flute...");

	}
	void wistle() {
		System.out.println("Wostling air in Flute...");

	}
}

class MetalFlute extends Flute {
	
	public void use() {
		System.out.println("Using MetalFlute...");
	}
	void play() {
		System.out.println("Playing MetalFlute...");

	}
	void blowAir() {
		System.out.println("Blowing air to Metal Flute...");

	}
	void wistle() {
		System.out.println("Wostling air in MetalFlute...");

	}
	void tuning() {
		System.out.println("Tuning metallic flute...");
	}
	
}

class WoddenFlute extends Flute {
	
	public void use() {
		System.out.println("Using WoddenFlute...");
	}
	void play() {
		System.out.println("Playing WoddenFlute...");

	}
	void blowAir() {
		System.out.println("Blowing air to WoddenFlute...");

	}
	void wistle() {
		System.out.println("Wostling air in WoddenFlute...");

	}
	void polishing() {
		System.out.println("polishing wooden flute...");
	}
	
}

class Harmonium extends AirBasedMusicalInstrument{
	public void use() {
		System.out.println("Using Harmonium...");
	}
	void play() {
		System.out.println("Playing Harmonium...");

	}
	void blowAir() {
		System.out.println("Blowing air using bellows");
		
	}
	void playreeds() {
		System.out.println("Playing reeds of Harmonium ");
	}
}

abstract class DrumBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneSurface();
}
class Tabla extends DrumBasedMusicalInstrument
{
	public void use() {
		System.out.println("Beating drums...");
	}
	void play() {
		System.out.println("Playing Drums...");

	}
	void tuneSurface() {
		System.out.println("Tuning surface of drums...");

	}
	void playingTwo() {
		System.out.println("beating two drums simultaniously...");

	}
}


class Damaru extends DrumBasedMusicalInstrument
{
	public void use() {
		System.out.println("usinging Damaru...");
	}
	void play() {
		System.out.println("Playing Damaru...");

	}
	void tuneSurface() {
		System.out.println("Tuning surface of Damaru...");

	}
	void playingWithDancing() {
		System.out.println("Damaru being used while dancing...");

	}
}

abstract class MedicalInstruments implements Instrument {
	  abstract void operate() ;
	}

	abstract class SurgicalInstrument extends MedicalInstruments{
		abstract void sterile();
	}

	abstract class PathologicalInstrument extends MedicalInstruments{
		abstract void reader();
	}

	class SurgicalCutter  extends SurgicalInstrument{

		@Override
		public void use() {
			 System.out.println("used for cutting while operation");
		}

		@Override
		void sterile() {
			 System.out.println("have a sterile");
		}

		@Override
		void operate() {
			 System.out.println("surgical knife is being used in operation");
		}
		
		void cutting() {
			 System.out.println("surgical knife is being used in operation");
		}
		
	}

	class SurgicalNeedle  extends SurgicalInstrument{

		@Override
		public void use() {
			 System.out.println("used for stiching after operation");
		}

		@Override
		void sterile() {
			 System.out.println("have a sterile");
		}

		@Override
		void operate() {
			 System.out.println("surgical needle is being used in operation");
		}
		
		void stitching() {
			 System.out.println("surgical needle is being used in stitching");
		}
		
	}

	class Glucometer extends PathologicalInstrument {

		@Override
		public void use() {
			System.out.println("Used to get blood sugar level");
		}

		@Override
		void reader() {
			System.out.println("show blood sugar reading");
		}

		@Override
		void operate() {
			System.out.println("operated by a pathologist");
		}
		
		void givesugarlevel() {
			System.out.println("Giving blood sugar level");
		}
		
	}

	class ECGMachine extends PathologicalInstrument {

		@Override
		public void use() {
			System.out.println("show your heart rhythm and electrical activity as a graph");
		}

		@Override
		void reader() {
			System.out.println("show your heart rhythm and electrical activity as a graph");
		}

		@Override
		void operate() {
			System.out.println("operated by a pathologist");
		}
		
		void haertRytmGraph() {
			System.out.println("show your heart rhythm and electrical activity as a graph");
		}
		
	}
