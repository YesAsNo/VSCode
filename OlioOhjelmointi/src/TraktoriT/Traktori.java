package TraktoriT;

public class Traktori {
    private int id;
	private String merkki;
	private String malli;
	private int teho;
	
	public Traktori() {}
	
	public Traktori(int id, String merkki, String malli, int teho) {
		this.id=id;
		this.merkki=merkki;
		this.malli=malli;
		this.teho=teho;
	}
	
	public int getId() {
		return id;
	}
	// Tämä checkId varmistaa erikseen vastaako user input haluttua vastausta (toiseen tehtävään)
	static public boolean checkId(int id) {
		return id>0;
	}

	static public boolean checkId(String id) {
		try {
			return checkId(Integer.parseInt(id));
		}
		catch(NumberFormatException e){
		}
		return false;
	}

	public boolean setId(int id) {
		if (checkId(id)){
			this.id = id;
			return true;
		}
		return false;
	}

	// Ylikuormitus, ei tarvitse toista returnia koska se palauttaa truen toisesta setteristä.
	public boolean setId(String id){
		try{
			return setId(Integer.parseInt(id));
		}
		catch(NumberFormatException e){
		}
		return false;
	}

	public String getMerkki() {
		return merkki;
	}
	static public boolean checkMerkkiMalli(String merkki){
		return merkki.length()>=5;
	}
	
	public boolean setMerkki(String merkki) {
		if (checkMerkkiMalli(merkki)) {
			this.merkki = merkki;
			return true;
		}
		return false;
	}

	public String getMalli() {
		return malli;
	}

	public boolean setMalli(String malli) {
		if (checkMerkkiMalli(malli)) {
			this.malli = malli;
			return true;
		}
		return false;
	}

	public int getTeho() {
		return teho;
	}
	static public boolean checkTeho(int teho){
		return teho>=30 && teho<=250;
	}

	// Toiseen tehtävään
	static public boolean checkTeho(String teho) {
		try {
			return checkTeho(Integer.parseInt(teho));
		}
		catch(NumberFormatException e){
		}
		return false;
	}

	public boolean setTeho(int teho) {
		if (checkTeho(teho)){
			this.teho = teho;
			return true;
		}
		return false;
	}
	
	public boolean setTeho(String teho){
		try{
			return setTeho(Integer.parseInt(teho));
		}
		catch(NumberFormatException e){
		}
		return false;
	}

	public String toString() {
		return this.id+": "+this.merkki+", "+this.malli+", "+this.teho+" ";

	}
}
