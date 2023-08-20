# Online Training Neural Network

## Introduction

Welcome to the Online Training Neural Network project! This Java program demonstrates the implementation of an online training algorithm for a simple neural network. The algorithm employs a basic perceptron model to learn and predict patterns from input-output pairs. This program can serve as both an educational tool to understand neural networks and a foundation for building more sophisticated neural network models.

## Table of Contents

- [Introduction](#introduction)
- [How It Works](#how-it-works)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Customization](#customization)
- [Contributing](#contributing)
- [License](#license)

## How It Works

Neural networks are computational models inspired by the human brain's structure and functioning. The implemented online training algorithm employs a simplified version known as a perceptron. This neural network consists of an input layer, a single output node, and adjustable weights and a threshold. The algorithm takes input patterns, adjusts the weights and threshold, and iteratively learns to predict the desired output.

## Getting Started

To start using the Online Training Neural Network program, follow these steps:

1. Clone the repository to your local machine using the following command:

   ```bash
   git clone https://github.com/your-username/online-training-neural-network.git
2. Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ).

## Usage

1. Open the `Program.java` file.
2. Modify the `y1` and `y2` arrays to contain your desired target output patterns. Each array element corresponds to the expected output for a specific input pattern.
3. Run the program. The training process will begin, and the algorithm will adjust the weights and threshold to match the provided target outputs.
4. Review the console output for progress updates, and observe how the error decreases over iterations.

## Customization

The program can be customized in the following ways:

- Network Architecture: You can modify the structure of the network by changing the number of input nodes and adding hidden layers.
- Learning Rate: The `learningRate` parameter controls how quickly the network adjusts its weights. You can experiment with different values to observe their impact on convergence speed and stability.
- Threshold: The threshold determines the boundary at which the network predicts either 0 or 1. Adjusting the threshold can influence the network's sensitivity to input patterns.

## Contributing

Contributions to this project are welcome! If you find issues, have suggestions for improvements, or want to add new features, feel free to submit pull requests. Please ensure your code adheres to the existing coding style and is well-documented.

## License

This project is licensed under the MIT License. You can find the full license text in the `LICENSE` file.
