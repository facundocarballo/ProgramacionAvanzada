notas(programacion, victor, 5).
notas(programacion, facundo, 9).
notas(programacion, angel, 2).
notas(programacion, random, 10).
notas(auditoria, ezequiel, 6).
notas(taller, nahuel, 1).
notas(taller, toni, 10).
notas(auditoria, lautaro, 8).
notas(auditoria, don, 9).

% Personas con maxima primer nota por materia
personasMaxPrimerNotaPorMateria(Materia, Persona, Nota):-
    maxPrimerNotaPorMateria(Materia, Nota),
    notas(Materia, Persona, Nota).

% Personas con maxima segunda nota por materia
personasMaxSegundaNotaPorMateria(Materia, Persona, Nota):-
    maxSegundaNotaPorMateria(Materia, Nota),
    notas(Materia, Persona, Nota).

% Max primer nota por materia
soloMateriaNota(Materia, Nota):-
    notas(Materia, _, Nota).

soloMateriaNotaSinPrimerMax(Materia, Nota):-
    soloMateriaNota(Materia, Nota),
    soloMateriaNota(Materia, Y),
    Nota < Y.

maxPrimerNotaPorMateria(Materia, Nota):-
    soloMateriaNota(Materia, Nota),
    \+(soloMateriaNotaSinPrimerMax(Materia, Nota)).

% Max segunda nota por materia
soloMateriaNotaSinSegundoMax(Materia, Nota):-
    soloMateriaNotaSinPrimerMax(Materia, Nota),
    soloMateriaNotaSinPrimerMax(Materia, Y),
    Nota < Y.

maxSegundaNotaPorMateria(Materia, Nota):-
    soloMateriaNotaSinPrimerMax(Materia, Nota),
    \+(soloMateriaNotaSinSegundoMax(Materia, Nota)).