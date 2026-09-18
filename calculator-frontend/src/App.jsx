import { useState } from "react";
import "./App.css";

function App() {
  const [a, setA] = useState("");
  const [b, setB] = useState("");
  const [result, setResult] = useState("");
  const [error, setError] = useState("");

  async function calculate(operation) {
    setError("");
    setResult("");

    try {
      const response = await fetch(
          `https://calculator-api-production-5187.up.railway.app/api/calculator/${operation}`,
          {
            method: "POST",
            headers: {
              "Content-Type": "application/json",
            },
            body: JSON.stringify({
              a: Number(a),
              b: Number(b),
            }),
          }
      );

      const data = await response.json();

      if (response.ok) {
        setResult(data.result);
      } else {
        setError(data);
      }
    } catch (error) {
      setError("Unable to connect to server");
    }
  }

  return (
      <div className="app">

        <div className="calculator-card">

          <h1>Calculator</h1>



          <div className="result-box">
            {result !== "" ? result : "0"}
          </div>

          <div className="input-group">
            <label>First Number</label>

            <input
                type="number"
                value={a}
                placeholder="Enter first number"
                onChange={(e) => setA(e.target.value)}
            />
          </div>

          <div className="input-group">
            <label>Second Number</label>

            <input
                type="number"
                value={b}
                placeholder="Enter second number"
                onChange={(e) => setB(e.target.value)}
            />
          </div>

          <div className="buttons">

            <button onClick={() => calculate("add")}>
              +
              <span>Add</span>
            </button>

            <button onClick={() => calculate("subtract")}>
              −
              <span>Subtract</span>
            </button>

            <button onClick={() => calculate("multiply")}>
              ×
              <span>Multiply</span>
            </button>

            <button onClick={() => calculate("division")}>
              ÷
              <span>Divide</span>
            </button>

          </div>

          {error && (
              <div className="error">
                {error}
              </div>
          )}

        </div>

      </div>
  );
}

export default App;