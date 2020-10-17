
let texto = "hola que tal, mi nombre es joaquín, mi edad es 19 años hace 3 años que programo!";

function normalize(palabra: string) {
    return palabra.toLowerCase().replace(",", "").replace(".", "").replace("!", "");
}

function palabrasRepetidas(texto: string) {
    let dict: {[key: string]: number} = {};
    let palabrasSeparadas = texto.split(" ");

    for (let palabra of palabrasSeparadas) {
        if (normalize(palabra) in dict) {
            ++dict[normalize(palabra)];
        } else {
            dict[normalize(palabra)] = 1;
        }
    }
    console.log(dict);

}

palabrasRepetidas(texto);