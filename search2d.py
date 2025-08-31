from typing import List, Optional, Tuple
import argparse

Matrix = List[List[int]]

# Matriz 3x3 de ejemplo
MATRIX: Matrix = [
    [7, 3, 5],
    [1, 9, 3],
    [4, 8, 6],
]

def buscar_primera_ocurrencia(mat: Matrix, objetivo: int) -> Optional[Tuple[int, int]]:
    """Devuelve (fila, columna) si encuentra 'objetivo'; None si no existe."""
    for i, fila in enumerate(mat):
        for j, val in enumerate(fila):
            if val == objetivo:
                return (i, j)
    return None

def imprimir_matriz(mat: Matrix) -> None:
    for fila in mat:
        print(fila)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Búsqueda en matriz 2D (3x3).")
    parser.add_argument("--target", type=int, default=3, help="Valor a buscar")
    args = parser.parse_args()

    print("Matriz:")
    imprimir_matriz(MATRIX)
    print(f"\nBuscando el valor: {args.target}")

    pos = buscar_primera_ocurrencia(MATRIX, args.target)
    if pos is None:
        print("No se encontró el valor en la matriz.")
    else:
        i, j = pos
        print(f"Encontrado: {args.target} en posición (fila={i}, columna={j}).")
