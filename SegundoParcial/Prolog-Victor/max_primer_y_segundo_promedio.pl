notas(programacion, victor, 5, 5).
notas(programacion, facundo, 7, 8).
notas(programacion, angel, 2, 2).
notas(programacion, random, 9, 10).
notas(auditoria, ezequiel, 6, 6).
notas(taller, nahuel, 1, 1).
notas(taller, toni, 9, 10).
notas(auditoria, lautaro, 8, 7).
notas(auditoria, don, 8, 7).


% Personas con el primer maximo promedio
personasConPrimerPromedioMax(Persona, Promedio):-
	maxPrimerPromedio(Promedio),
	notas(_, Persona, Nota1, Nota2),
	PromedioActual is (Nota1 + Nota2) / 2,
	PromedioActual == Promedio.

% Personas con el segundo maximo promedio
personasConSegundoPromedioMax(Persona, Promedio):-
    maxSegundoPromedio(Promedio),
    notas(_, Persona, Nota1, Nota2),
    PromedioActual is (Nota1 + Nota2) / 2,
    PromedioActual == Promedio.

% Primer promedio maximo
soloPromedios(Promedio):-
    notas(_, _, Nota1, Nota2),
	Promedio is (Nota1 + Nota2) / 2.

soloPromediosSinPrimerMax(Promedio):-
	soloPromedios(Promedio),
	soloPromedios(Y),
	Promedio < Y.

maxPrimerPromedio(Promedio):-
    soloPromedios(Promedio),
    \+(soloPromediosSinPrimerMax(Promedio)),
    !.

% Segundo promedio maximo
soloPromediosSinSegundoMax(Promedio):-
    soloPromediosSinPrimerMax(Promedio),
    soloPromediosSinPrimerMax(Y),
    Promedio < Y.

maxSegundoPromedio(Promedio):-
    soloPromediosSinPrimerMax(Promedio),
    \+(soloPromediosSinSegundoMax(Promedio)),
    !.