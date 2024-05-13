# Orden de ejecución
## Asi calculamos el orden del método **preparadoViable()**:
Como entrada tenemos un suero y una lista de farmacos = n (cantidad de elementos de la lista).

Debido a que en los if se busca por coincidencias con la listanegra y listablanca, diremos que m es la cantidad de elementos de listablanca y p la cantidad de elementos de listanegra.
Multiplicamos por n ya que la busqueda es para cada fármaco.

Nuestro orden queda asi:
O((m+p) * n)
