notas(programacion, victor, 5).
notas(programacion, facundo, 9).
notas(programacion, angel, 2).
notas(programacion, random, 10).
notas(auditoria, ezequiel, 6).
notas(taller, nahuel, 1).
notas(taller, toni, 10).
notas(auditoria, lautaro, 8).
notas(auditoria, don, 9).


% Personas con primer nota maxima
personasConPrimeraNotaMax(Persona, Nota):-
    maxPrimerNota(Nota),
    notas(_, Persona, Nota).

% Personas con segunda nota maxima
personasConSegundaNotaMax(Persona, Nota):-
    maxSegundaNota(Nota),
    notas(_, Persona, Nota).

% Primer Nota Maxima
soloNotas(Nota):-
    notas(_, _, Nota).

soloNotasSinPrimerMax(Nota):-
    soloNotas(Nota),
    soloNotas(Y),
    Nota < Y.

maxPrimerNota(Nota):-
    soloNotas(Nota),
    \+(soloNotasSinPrimerMax(Nota)),
    !.

% Segunda Nota Maxima
soloNotasSinSegundoMax(Nota):-
    soloNotasSinPrimerMax(Nota),
    soloNotasSinPrimerMax(Y),
    Nota < Y.


maxSegundaNota(Nota):-
    soloNotasSinPrimerMax(Nota),
    \+(soloNotasSinSegundoMax(Nota)),
    !.




