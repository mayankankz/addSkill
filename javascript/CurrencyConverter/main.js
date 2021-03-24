let url = "https://api.exchangeratesapi.io/latest?base=";

async function convert(){
    var base=document.getElementById('base').value;
    var output=document.getElementById('output').value;
    var amount = document.getElementById('amount').value;
    var finalresult;

    let responce = await fetch(`${url}${base}`,{method:'GET'})
    let data = await responce.json()

    finalresult = data.rates;

    finalresult = finalresult[output]*Number(amount);
    var result = `Converted Amount of ${amount} ${base} is ${finalresult} ${output}`;
    document.getElementById('converted').innerText = result;


}
