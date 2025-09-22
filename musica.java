public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}const catalogo2 = [
  "Desperte sentidos com fragrâncias que marcam presença.",
  "Perfumes nacionais, árabes e importados — o luxo começa aqui.",
  "Aroma é identidade. Encontre o seu.",
  "Do Oriente ao Ocidente: fragrâncias que encantam.",
  "Cada perfume, uma história. Qual será a sua?"
];

const frases = [
  "Frete grátis em todo o Brasil.",
  "Cupons até com 40% de desconto.",
  "Parcele em até 12x sem juros.",
  "5% de desconto pagando com pix.",
  "Perfumaria importada com preço baixo."
];

let indexFrase = 0;
let indexCatalogo = 0;

const quoteElement = document.getElementById("quote");
const quoteElement2 = document.getElementById("catalogo");

function mostrarProximaFrase() {
  quoteElement.style.transform = "translateY(-100%)";
  quoteElement.style.opacity = 0;
  quoteElement2.style.transform = "translateY(-100%)";
  quoteElement2.style.opacity = 0;

  setTimeout(() => {
    
    quoteElement.textContent = frases[indexFrase];
    quoteElement2.textContent = catalogo2[indexCatalogo];

    quoteElement.style.transform = "translateY(100%)";
    quoteElement2.style.transform = "translateY(100%)";

    setTimeout(() => {
      quoteElement.style.transform = "translateY(0)";
      quoteElement.style.opacity = 1;
      quoteElement2.style.transform = "translateY(0)";
      quoteElement2.style.opacity = 1;
    }, 50);
  }, 400);

  
  indexFrase = (indexFrase + 1) % frases.length;
  indexCatalogo = (indexCatalogo + 1) % catalogo2.length;
}

mostrarProximaFrase();
setInterval(mostrarProximaFrase, 4000);