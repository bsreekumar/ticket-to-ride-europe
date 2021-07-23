package main;

public enum CityName {
	
	EDINBURGH,
	LONDON,
	DIEPPE,
	BREST,
	PAMPLONA,
	MADRID,
	LISBOA,
	CADIZ,
	BARCELONA,
	PARIS,
	BRUXELLES,
	AMSTERDAM,
	ESSEN,
	FRANKFURT,
	MUNCHEN,
	ZURICH,
	MARSEILLE,
	ROMA,
	VENEZIA,
	WIEN,
	BERLIN,
	KOBENHAVN,
	STOCKOLM,
	DANZIC,
	WARZAWA,
	BUDAPEST,
	ZAGRAB,
	SARAGEVO,
	PALERMO,
	BRINDISI,
	RICA,
	WILNO,
	SOFIA,
	ATHINA,
	SMYRNA,
	CONSTANTINOPLE,
	ANCORA,
	BUCURESTI,
	KYIV,
	SMOLENSK,
	PETROGRAD,
	MOSKVA,
	KHARKOV,
	ROSTOV,
	SOCHI,
	SEVASTAPOL,
	ERZURUM;
	
	public String toString() {
		return this.name().charAt(0) + this.name().substring(1).toLowerCase();
	}
}
