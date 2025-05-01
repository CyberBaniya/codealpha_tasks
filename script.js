let portfolio = {
    AAPL: 0,
    GOOG: 0,
    AMZN: 0
};

function buyStock(stock) {
    let price = 0;
    let stockName = '';

    if (stock === 'AAPL') {
        price = 150;
        stockName = 'AAPL';
    } else if (stock === 'GOOG') {
        price = 2800;
        stockName = 'GOOG';
    } else if (stock === 'AMZN') {
        price = 3400;
        stockName = 'AMZN';
    }

    if (portfolio[stock] >= 0) {
        portfolio[stock]++;
        alert(`${stockName} Stock bought! Current holdings: ${portfolio[stock]} shares.`);
        updatePortfolioDisplay();
    }
}

function updatePortfolioDisplay() {
    let portfolioDisplay = document.getElementById('portfolioDisplay');
    portfolioDisplay.innerHTML = `Portfolio: <br> 
                                 AAPL: ${portfolio.AAPL} shares<br>
                                 GOOG: ${portfolio.GOOG} shares<br>
                                 AMZN: ${portfolio.AMZN} shares`;
}
