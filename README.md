# ticket-to-ride-europe
Attempt at implementing the board and gameplay for Ticket to Ride Europe

PlayerColor
 - BLUE
 - GREEN
 - RED
 - YELLOW
 - BLACK

TrainCarColor
 - PINK
 - WHITE
 - BLUE
 - YELLOW
 - ORANGE
 - BLACK
 - RED
 - GREEN
 - LOCOMOTIVE

CityName
 - EDINBURGH
 - LONDON
 - DIEPPE
 - BREST
 - PAMPLONA
 - MADRID
 - LISBOA
 - CADIZ
 - BARCELONA
 - PARIS
 - BRUXELLES
 - AMSTERDAM
 - ESSEN
 - FRANKFURT
 - MUNCHEN
 - ZURICH
 - MARSEILLE
 - ROMA
 - VENEZIA
 - WIEN
 - BERLIN
 - KOBENHAVN
 - STOCKOLM
 - DANZIC
 - WARZAWA
 - BUDAPEST
 - ZAGRAB
 - SARAGEVO
 - PALERMO
 - BRINDISI
 - RICA
 - WILNO
 - SOFIA
 - ATHINA
 - SMYRNA
 - CONSTANTINOPLE
 - ANCORA
 - BUCURESTI
 - KYIV
 - SMOLENSK
 - PETROGRAD
 - MOSKVA
 - KHARKOV
 - ROSTOV
 - SOCHI
 - SEVASTAPOL
 - ERZURUM

Player
 - PlayerColor color
 - int numOfCars (DEFAULT - 45)
 - int numOfStations (DEFAULT - 3)

City
 - CityName name
 - boolean hasStation
 - Color stationColor

Route
 - City firstCity
 - City secondCity
 - boolean isTaken
 - Player player
 - TrainCarColor color
 - int countLocomotive


